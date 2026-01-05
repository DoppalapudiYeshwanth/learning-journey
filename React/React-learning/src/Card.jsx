import './Card.css'

function Card({title, description, newPrice, oldPrice}){
    return(
        <div className="card">
        <div className="card-upper">
            <h3 className="card-text">{title}</h3>
            <p className="card-text">{description}</p>
        </div>
        <div className='card-lower'>
                <p id="oldPrice">₹{oldPrice}</p>
                <p>₹{newPrice}</p>
        </div>
        </div>
    )
}

export default Card;